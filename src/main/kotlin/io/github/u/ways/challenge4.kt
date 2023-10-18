package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge4(request: Request) {
if ((request.name== "")||(request.email== "")||(request.phone== "")||(request.address== ""))
         println("A mandatory field is missing!")
     else{
    if ((request.landline||request.mobile) && (request.internet||request.tv)) {
println ("Routing to Telecom & Broadband department!")}
    else if  (request.internet||request.tv) {
       println("Routing to Broadband department!")
    } else if  (request.landline||request.mobile){
        println ("Routing to Telecom department!")}   
    if (request.internet)
    println("Internet product code: F_004")
   if(request.mobile)
    println("Mobile product code: F_002")
    if(request.tv)
    println("TV product code: = F_003")
    if(request.landline)
    println("Landline product code: = F_001") }
if((!request.internet&&!request.mobile)&&(!request.tv&&!request.landline))
println("No products required!")

}
  

  
