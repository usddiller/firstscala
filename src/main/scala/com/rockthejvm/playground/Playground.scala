package com.rockthejvm.playground

import cats.effect.{IO, IOApp}

object Playground extends IOApp.Simple {
  val run: IO[Unit] = IO.println("Ready for the first exercise!")
}