package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge2(request: Request) {
  if ((!request.internet&&!request.tv) &&(!request.landline&&!request.mobile))   {
       println("No products ordered")

}}
