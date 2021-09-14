package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val shubhamUser: User = User("Shubham","Saini",23,"knoldus","shubham.saini@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(shubhamUser)) thenReturn(true)
    val result = userImpl.createUser(shubhamUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(shubhamUser)) thenReturn(false)
    val result = userImpl.createUser(shubhamUser)
    assert(result.isEmpty)
  }

}
