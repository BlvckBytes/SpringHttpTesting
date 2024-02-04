package me.blvckbytes.springhttptesting.validation

fun interface ValidatorFunction<T> {
  fun validate(value: T?)
}