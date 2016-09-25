# my-actor-delayed-execution-sample

https://www.qoosky.io/techs/e0f555bc87#遅延実行

```sh
[info] Running com.example.Hello 
[INFO] [09/25/2016 18:03:57.687] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] trigger
[INFO] [09/25/2016 18:04:07.711] [mySystem-akka.actor.default-dispatcher-3] [akka://mySystem/user/myActor] start looping
[INFO] [09/25/2016 18:04:09.738] [mySystem-akka.actor.default-dispatcher-3] [akka://mySystem/user/myActor] loop
[INFO] [09/25/2016 18:04:10.728] [mySystem-akka.actor.default-dispatcher-3] [akka://mySystem/user/myActor] loop
[INFO] [09/25/2016 18:04:10.757] [ForkJoinPool-2-worker-5] [akka://mySystem/user/myActor] (loop)
[INFO] [09/25/2016 18:04:11.728] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] loop
[INFO] [09/25/2016 18:04:11.747] [ForkJoinPool-2-worker-5] [akka://mySystem/user/myActor] (loop)
[INFO] [09/25/2016 18:04:12.728] [mySystem-akka.actor.default-dispatcher-3] [akka://mySystem/user/myActor] loop
[INFO] [09/25/2016 18:04:12.748] [ForkJoinPool-2-worker-5] [akka://mySystem/user/myActor] (loop)
[INFO] [09/25/2016 18:04:13.728] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] loop
[INFO] [09/25/2016 18:04:13.747] [ForkJoinPool-2-worker-5] [akka://mySystem/user/myActor] (loop)
[INFO] [09/25/2016 18:04:14.728] [mySystem-akka.actor.default-dispatcher-3] [akka://mySystem/user/myActor] loop
[INFO] [09/25/2016 18:04:14.747] [ForkJoinPool-2-worker-5] [akka://mySystem/user/myActor] (loop)
[INFO] [09/25/2016 18:04:15.728] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] loop
[INFO] [09/25/2016 18:04:15.747] [ForkJoinPool-2-worker-5] [akka://mySystem/user/myActor] (loop)
[success] Total time: 23 s, completed 2016/09/25 18:04:16
```
