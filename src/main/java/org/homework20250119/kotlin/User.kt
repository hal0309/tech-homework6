package org.homework20250119.kotlin;


class User(var name: String, var age: Int?, var email: String?) {
//    var name: String? = null
//    var age: Int = 0
//    var email: String? = null

    private var status: Status? = null

//    constructor(name: String?, age: Int?, email: String?){
    init{
        // nullの場合は空文字を設定
        if (name == null) {
            this.name = ""
        }else {
            this.name = name
        }

//        this.age = age
//        this.email = email

        // 年齢によってステータスを設定
    this.status = when (age){
      null -> Status.UNKNOWN
      in 1..20 -> {
          Status.JUNIOR
      }
      else -> Status.SENIOR
    }
//        if (age == null) {
//            this.status = Status.UNKNOWN
//        }else if ( age!! < 20 ){
//            this.status = Status.JUNIOR
//        }else {
//            this.status = Status.SENIOR
//        }


    }

    fun hello() {
        println("Hello$name!");
    }

    override fun toString(): String {
        return "User($name$age$email$status)"
    }
}