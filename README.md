# Lab work #2

# Task

Цель работы: на простом примере разобраться с основными концепциями ООП и научиться использовать их в программах.
Что надо сделать (краткое описание):

1. Ознакомиться с [документацией](https://se.ifmo.ru/~tony/doc) , обращая особое внимание на классы Pokemon и Move. При дальнейшем выполнении лабораторной работы читать документацию еще несколько раз.
2. Скачать файл Pokemon.jar. Его необходимо будет использовать как для компиляции, так и для запуска программы. Распаковывать его не надо! Нужно научиться подключать внешние jar-файлы к своей программе.
3. Написать минимально работающую программу и посмотреть как она работает.
4. Battle b = new Battle();
5. Pokemon p1 = new Pokemon("Чужой", 1);
6. Pokemon p2 = new Pokemon("Хищник", 1);
7. b.addAlly(p1);
8. b.addFoe(p2);
9. b.go();
10. Создать один из классов покемонов для своего варианта. Класс должен наследоваться от базового класса Pokemon. В конструкторе нужно будет задать типы покемона и его базовые характеристики. После этого попробуйте добавить покемона в сражение.
11. Создать один из классов атак для своего варианта (лучше всего начать с физической или специальной атаки). Класс должен наследоваться от класса PhysicalMove или SpecialMove. В конструкторе нужно будет задать тип атаки, ее силу и точность. После этого добавить атаку покемону и проверить ее действие в сражении. Не забудьте переопределить метод describe, чтобы выводилось нужное сообщение.
12. Если действие атаки отличается от стандартного, например, покемон не промахивается, либо атакующий покемон также получает повреждение, то в классе атаки нужно дополнительно переопределить соответствующие методы (см. документацию). При реализации атак, которые меняют статус покемона (наследники StatusMove), скорее всего придется разобраться с классом Effect. Он позволяет на один или несколько ходов изменить состояние покемона или модификатор его базовых характеристик.
13. Доделать все необходимые атаки и всех покемонов, распределить покемонов по командам, запустить сражение.

![image](https://github.com/BZ6/ProgLab2/assets/85627560/a1a3954c-ed07-4357-96fa-31f130734d45)

# Class diagram

![image](https://github.com/BZ6/ProgLab2/assets/85627560/dc8ca9a0-ca3b-4046-89c0-dff370ed84b3)

# Output

    Gloom Безымянный из команды желтых вступает в бой!
    Alomomola Безымянный из команды черных вступает в бой!
    Alomomola Безымянный Double Slap. 
    Gloom Безымянный теряет 4 здоровья.
    Alomomola Безымянный Double Slap. 
    Gloom Безымянный теряет 2 здоровья.
    Alomomola Безымянный Double Slap. 
    Gloom Безымянный теряет 4 здоровья.
    Alomomola Безымянный Double Slap. 
    Gloom Безымянный теряет 3 здоровья.
    Gloom Безымянный теряет сознание.
    Bellossom Безымянный из команды желтых вступает в бой!
    Alomomola Безымянный промахивается
    Alomomola Безымянный промахивается
    Alomomola Безымянный Double Slap. 
    Bellossom Безымянный теряет 3 здоровья.
    Alomomola Безымянный Double Slap. 
    Bellossom Безымянный теряет 4 здоровья.

    Bellossom Безымянный Mega Drain. 
    Alomomola Безымянный теряет 16 здоровья.
    Bellossom Безымянный восстанавливает 8 здоровья.
    Alomomola Безымянный теряет сознание.
    Octillery Безымянный из команды черных вступает в бой!
    Octillery Безымянный Psychic. 
    Bellossom Безымянный теряет 5 здоровья.

    Bellossom Безымянный Mega Drain. 
    Octillery Безымянный теряет 15 здоровья.
    Bellossom Безымянный восстанавливает 7 здоровья.
    Octillery Безымянный теряет сознание.
    Remoraid Безымянный из команды черных вступает в бой!
    Bellossom Безымянный Leaf Blade. 
    Remoraid Безымянный теряет 18 здоровья.
    Remoraid Безымянный теряет сознание.
    В команде черных не осталось покемонов.
    Команда желтых побеждает в этом бою!
