# Использованные технологии
* Spring Boot – как основной фрэймворк
* Gradle – как система сборки приложения
* Lombok – для удобной работы с POJO классами

# Код
RESTful приложения  с единственным endpoint'ом, который принимает строку и выдает результат вычисляющий частоту встречи символов по заданной строке в отсортированном по убыванию количества вхождений символа в заданную строку.
* controller (src/main/java/com/example/tasktestt1/controller/OutputController.java)
* service (src/main/java/com/example/tasktestt1/service/OutputService.java)

# Тесты
Написаны только для единственного REST endpoint'а 
(src/test/java/com/example/tasktestt1/service/OutputServiceTest.java)

* MockMvc
* AssertJ
* JUnit5

# Как запустить локально?
1) Сначала нужно склонировать этот репозиторий
   * git clone https://github.com/Sergey26-zh/TaskTestT1.git
2) Далее собрать gradle проект
  * Нужно запустить из корневой директории, где лежит build.gradle.kts
  *  gradle build
