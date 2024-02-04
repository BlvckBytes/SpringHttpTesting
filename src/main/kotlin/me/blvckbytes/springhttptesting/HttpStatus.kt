package me.blvckbytes.springhttptesting

enum class HttpStatus(
  val code: Int
) {
  OK(200),
  NO_CONTENT(204),
  NOT_FOUND(404),
  BAD_REQUEST(400),
}