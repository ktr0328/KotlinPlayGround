package SuperTest

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val student = Student("hoge", 3333)
    student.introduceMyself()
    println(student)

    val person: Person = student
    person.introduceMyself()
    println(person)

    person.move()
}
