package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val shubhamEmployee: Employee = Employee("Shubham","Saini",20,15000,"Intern","knoldus","shubham.saini@knoldus.com")
  val rakhiEmployee: Employee = Employee("Rakhi","Pareek",29,150000,"Software Engineer","Philips","rakhi.pareek@philips.com")

  val employees: HashMap[String, Employee] = HashMap("Shubham" -> shubhamEmployee, "Rakhi" -> rakhiEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
