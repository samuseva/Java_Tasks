<a href=/src/com/company/Task1.java>Task1</a><br>
<b>Задание на модификаторы доступа: public, protected, private:</b>

Создать класс Modificators в пакете, отличном от Main класса с несколькими полями:<br>
	поле доступно напрямую
	поле доступно только через методы доступа(getters/setters)
	поле доступно только в наследнике
	поле доступно только в том же пакете
Порверить корректность конфигурирования/видимость полей из main и других классов(создать при необходимости).
Объявить переменную типа Modificators и создать объект.

<a href=/src/com/company/Task2.java>Task2</a><br>
Добавление в List<Integer> нельзя List<int>:
	
Создать список объектов типа Integer.
Заполнить список объектами Integer и простыми типами int.
Проитерировать по списку. На каждой итерации:
	Если индекс четный, создать переменную типа Integer и присвоить ей текущее значение из списка.
	Иначе присвоить текущее значение типу int.
	Вывести в консоль тип текущего значения из списка.
Все объекты одного типа? Почему возможно положить простой тип в список? Возможно ли положить Integer в int?

<a href=/src/com/company/Task3.java>Task3</a><br>
Передачи параметра по ссылке и по значению:

Написать два метода для иллюстрации передачи значения параметра по ссылке и по значению.
Распечатка значений до вызова метода, в методе и после вызова.
Должны показывать как меняются/неменяются значения переменных.

<a href=/src/com/company/Task4.java>Task4</a><br>
Работа с массивами:

Создать два массива размером 10.
Заполнить случайными значениями от 0 до 9 включительно.
Попарно сравнить элементы.
Вывести результат каждого сравнения в виде "значение_1 знак сравнения (<>=) значение_2".
Нечетные индексы вывести через конкатенацию строк.
Четные индексы через метод String.format(..).
Выбор знака сравнения через тернарный оператор.

<a href=/src/com/company/Task5.java>Task5</a><br>
Продолжение работы с массивами:

Написать метод принимающий аргумент типа int и возвращающий строку случайных букв, длиной равной аргументу метода.
Написать метод принимающий строку в качестве аргумента и возвращающий ее в обратном порядке
(без использования встроенных функций для переворота строки).
Создать цикл while из 10 итераций.
В каждой итерации вызывать первый метод, аргументом передавая индекс итерации.
Полученное значение передать на вход второму методу.
Результат работы каждой итерации вывести в виде "строка_1 : строка_2".
В конце итерации (через switch) для индексов от 0 до 3(включительно) выводить "индекс - 'номер индекса цифрой'".
Для 4 - 5 "индекс четыре", "индекс пять" соответственно. Для остальных "индекс больше пяти".

<a href=/src/com/company/Task6>Task6</a><br>
Comparator vs Comparable:

Создать интерфейс Animal с методом voice.
Создать абстрактный класс AbstractAnimal реализующий Animal с реализацией метода voice по умолчанию.
Создать класс Cat наследующий AbstractAnimal.
Поля name и age.
Переопределить в нем метод voice.
Создать коллекцию объектов класса Cat.
Доавить несколько объектов.
Отсортировать 2-я способами Collections.sort(list) и Collections.sort(list, comparator).

Task7<br>
Inner, Nested, Anonymous и Local классы:

Написать и создать объекты внутреннего класса,
внутреннего статического класса,
анонимного класса,
локального класса.
(классы Продукт и Тип продукта)

Task8<br>
Задание на final:

Создать класс с неизменяемыми полями и проинициализировать их.

Task9<br>
Задание на Enum:

Создать enum для времени суток, с полями name String, startHour и endHour типа int
(Morning с 6 до 10, Day с 10 до 5, Evening с 5 до 9, Night с 9 до 6).
Переопределить метод toString() для возврата "Время 'имя объекта' с 'start' до 'end'".
Создать объекты утро и вечер и вывести с помощью System.out.println()

<a href=/src/com/company/Task10.java>Task10</a><br>
Задание на Collection и Iterator:

Создать списки для List, HashSet, SortedSet.
Заполнить значениями из ("abc", "cba", "Bca", "bca", "Abc", "ABc", "acb", "bca", "abc").
Вывести получившиеся списки. Причина различия выведенных данных?
Выполнить итерации по спискам из предыдущего задания с использованием итератора.

Task12<br>
Задание на Exceptions:

Написать метод принимающий два аргумента типа double.
	Создать собственный класс проверяемого исключения - выбрасывается в случае, если аргумент < 0.
	Создать собсвенный класс непроверяемого исключения - деление на ноль запрещено.
	В методе выбрасывать проверяемое исключение, если один из аргументов < 0. Непроверяемое, если второй аргумент == 0.

<a href=/src/com/company/Task13.java>Task13</a><br>
Задание на ввод/вывод. Чтение из файла:

В цикле сделать вызов меотда и вывод в консоль результатов вызова метода,
для аргументов (4,2), (-2,1), (0,1), (6, -1), (4,0).
Для всех итераций вывести результаты в виде "arg_1 / arg_2: {result}".
Создать текстовый файл в любом редакторе и значениями 1 на первой строке,
2 на второй строке, 3 на третьей.
Написать метод читающий созданный файл построчно и печатающий в консоль каждую строку.
Обработку исключений вполнить 2-я способами - 1-ый через try catch и 2-ой try catch with resources.
