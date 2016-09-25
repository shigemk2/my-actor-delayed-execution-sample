package com.example

import akka.actor.{ActorSystem, Props}

object Hello {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")
    val props = Props[MyActor]
    val actor = system.actorOf(props, name = "myActor")

    actor ! "trigger"

    while(true) {
      Thread.sleep(1000)
    }
  }
}
