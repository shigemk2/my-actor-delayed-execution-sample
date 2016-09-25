package com.example

import akka.actor.Actor
import akka.event.Logging
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


class MyActor extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case "trigger" => {
      log.info("trigger")
      val schedule = context.system.scheduler.scheduleOnce(10 seconds, self, "start logging")
    }
    case "start logging" => {
      log.info("start logging")
      context.system.scheduler.schedule(2 seconds, 1 second, self, "loop")
    }
    case "loop" => {
      log.info("loop")
      context.system.scheduler.scheduleOnce(1 second) {
        log.info("(loop)")
      }
    }
    case _ => {
    }
  }
}
