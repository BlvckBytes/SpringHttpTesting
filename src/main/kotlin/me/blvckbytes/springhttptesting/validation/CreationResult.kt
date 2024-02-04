package me.blvckbytes.springhttptesting.validation

import me.blvckbytes.springhttptesting.HttpResponse

class CreationResult(
  val response: HttpResponse,
  val validator: BodyValidator
)