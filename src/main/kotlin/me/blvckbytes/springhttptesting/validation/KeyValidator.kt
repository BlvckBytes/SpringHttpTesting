package me.blvckbytes.springhttptesting.validation

open class KeyValidator(
  val extractor: (response: JsonObjectExtractor) -> Any?,
  val validator: ValidatorFunction<Any?>
)