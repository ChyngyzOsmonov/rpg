package org.example.utils;

import java.util.ArrayList;
import java.util.List;

public class TextDB {
    public static List<String> mainTextList() {
        String greatingText = "Привет, как дела?";
        String explainGameRule = "Сегодня мы начнем симулятор программиста";
        String chooseDevelopment = "Давай начнем с того что тебе нужно выбрать направление";
        String backed = "Backend - если коротко объяснить это логика всего приложения";
        String frontend = "Frontend - это все то что видишь ты";
        String chooseOne = "Теперь, ты должен выбрать направление";
        String darkOne = "Темная сторона - Backend";
        String lightOne = "Светлая сторона - Frontend";
        String ifChose = "Напиши B если ты за темную сторону или же F если ты красавчик и ты за светлую сторону)";

        List<String> texts = new ArrayList<>();
        texts.add(greatingText);
        texts.add(explainGameRule);
        texts.add(chooseDevelopment);
        texts.add(backed);
        texts.add(frontend);
        texts.add(chooseOne);
        texts.add(darkOne);
        texts.add(lightOne);
        texts.add(ifChose);

        return texts;
    }

    public static List<String> mainBackendTextList() {
        String backChose = "Итак, ты выбрал темную сторону";
        String someText = "Но это нормально, не всем дано быть добрыми";
        String chooseLanguage = "Теперь выбеери язык на котором ты будешь программировать";
        String languages = "Напиши J если хочешь выбрать Java\nC если C#\nPh если PHP";

        List<String> texts = new ArrayList<>();
        texts.add(backChose);
        texts.add(someText);
        texts.add(chooseLanguage);
        texts.add(languages);

        return texts;
    }

    public static List<String> cSharpJunior(int choice) {
        List<String> texts = new ArrayList<>();
        String text1 = "Ты начинаешь свою карьеру Джуна, работая над старым проектом для автоматизации отчётов.";
        String text2 = "Проект запущен много лет назад, код устарел и плохо задокументирован.";
        String text3 = "Задача: исправить 3 критических бага и добавить новый отчёт в систему.";
        String text4 = "Внимание! Твой начальник предупреждает, что если ты не справишься за неделю, тебя уволят.";

        String text5 = "Выбери действие: \n1. Начать с поиска багов. \n2. Обратиться за помощью к ментору. \n3. Пытаться сделать всё самому.";

        String choice1 = "Ты нашёл баги, но время уходит, и дедлайн близко.";
        String choice1_2 = "Начальник недоволен прогрессом и предупреждает ещё раз.";
        String choice1_3 = "Ты успеваешь исправить только два из трёх багов. К сожалению, тебя уволили за невыполнение задачи.";

        String choice2 = "Ментор дал тебе полезные советы, и ты быстро исправил баги. Новый отчёт был добавлен вовремя.";
        String choice2_1 = "Проект успешно завершён, и начальник доволен. Продолжай в том же духе!";

        String choice3 = "Ты решил сделать всё сам, но из-за недостатка опыта запутался в коде.";
        String choice3_1 = "Проект не завершён вовремя. Тебя уволили.";

        switch (choice) {
            case (0):
                texts.add(text1);
                texts.add(text2);
                texts.add(text3);
                texts.add(text4);
                texts.add(text5);
                break;
            case (1):
                texts.add(choice1);
                texts.add(choice1_2);
                texts.add(choice1_3);
                break;
            case (2):
                texts.add(choice2);
                texts.add(choice2_1);
                break;
            case (3):
                texts.add(choice3);
                texts.add(choice3_1);
                break;
        }

        return texts;
    }

    public static List<String> cSharpMiddle(int choice) {
        List<String> texts = new ArrayList<>();
        String text = "Ты Мидл-разработчик, и тебе поручили создание нового модуля для электронной коммерции.";
        String text2 = "Клиент требует интеграцию с внешним API для расчета доставки.";
        String text3 = "Задача: разработать модуль и протестировать его на основе требований.";
        String text4 = "Если ты не успеешь за две недели — проект под угрозой срыва, а тебя могут уволить.";

        String text5 = "Выбери действие: \n1. Работать сверхурочно, чтобы уложиться в сроки. \n2. Делегировать часть задач джунам. \n3. Упростить функционал и сдать быстрее.";

        String choice1 = "Ты много работал, но из-за стресса допустил несколько критических ошибок в коде.";
        String choice1_2 = "Проект сдан с ошибками, и клиент отказался от сотрудничества. Тебя уволили.";

        String choice2 = "Джун помог справиться с задачами. Модуль успешно завершён, но тебе пришлось провести много ревью кода.";
        String choice2_1 = "Клиент доволен, и проект принят. Начальник оценил твою способность управлять командой.";

        String choice3 = "Ты решил упростить функционал, но клиент был недоволен сокращением возможностей.";
        String choice3_1 = "Проект не принят, и ты получил выговор, но удержался на работе.";

        switch (choice) {
            case (0):
                texts.add(text);
                texts.add(text2);
                texts.add(text3);
                texts.add(text4);
                texts.add(text5);
                break;
            case (1):
                texts.add(choice1);
                texts.add(choice1_2);
                break;
            case (2):
                texts.add(choice2);
                texts.add(choice2_1);
                break;
            case (3):
                texts.add(choice3);
                texts.add(choice3_1);
                break;
        }
        return texts;
    }

    public static List<String> cSharpSenior(int choice) {
        List<String> texts = new ArrayList<>();
        String text = "Как Сеньор, ты получил задачу разработать архитектуру нового веб-приложения для крупного банка.";
        String text2 = "Ты ответственен за весь проект и команду, но из-за сложной интеграции с банковскими системами проект может пойти не так.";
        String text3 = "Задача: спроектировать архитектуру, обучить команду и внедрить систему безопасности.";
        String text4 = "Ставки высоки: провал проекта — это не только потеря контракта, но и твоя репутация и работа.";

        String text5 = "Выбери действие: \n1. Проводить ежедневные собрания и контролировать каждый этап. \n2. Довериться команде и сосредоточиться на архитектуре. \n3. Внедрить быстрые решения, чтобы не выбиться из сроков.";

        String choice1 = "Ты уделил много времени контролю команды, но из-за этого не успел сосредоточиться на архитектуре.";
        String choice1_2 = "Проект получился неэффективным, и банк расторг контракт. Тебя уволили.";

        String choice2 = "Ты сосредоточился на ключевых аспектах архитектуры, а команда справилась с разработкой.";
        String choice2_1 = "Проект успешно завершён, банк доволен, и ты заслужил повышение.";

        String choice3 = "Ты внедрил быстрые решения, которые привели к уязвимостям в системе безопасности.";
        String choice3_1 = "Банк обнаружил проблемы, и проект был отменён. Ты получил серьёзный выговор, но сохранил работу.";

        switch (choice) {
            case (0):
                texts.add(text);
                texts.add(text2);
                texts.add(text3);
                texts.add(text4);
                texts.add(text5);
                break;
            case (1):
                texts.add(choice1);
                texts.add(choice1_2);
                break;
            case (2):
                texts.add(choice2);
                texts.add(choice2_1);
                break;
            case (3):
                texts.add(choice3);
                texts.add(choice3_1);
                break;
        }
        return texts;
    }

    public static List<String> defaultTextWeakLevel() {
        List<String> texts = new ArrayList<>();
        texts.add("Тебе еще рано программировать, тебе надо еще больше учиться, ты нам не подходишь");
        return texts;
    }

    public static List<String> javaJunior(int choice) {
        List<String> texts = new ArrayList<>();
        String text = "Ты начинающий Java-разработчик, и тебе поручили написать простой калькулятор.";
        String text2 = "Казалось бы, что может быть проще? Но твой коллега-сеньор уверяет, что для этого нужен паттерн проектирования 'Стратегия' и фреймворк Spring.";
        String text3 = "Задача: написать калькулятор, который умеет складывать, вычитать, умножать и делить.";
        String text4 = "Если не справишься, придется объяснять начальнику, почему калькулятор не умеет готовить кофе.";
        String text5 = "Выбери действие: \n1. Использовать все самые сложные технологии, чтобы впечатлить коллег. \n2. Написать простой код, который работает. \n3. Сделать калькулятор, который использует AI.";
        String choice1 = "Ты написал калькулятор с использованием всех известных тебе технологий, но забыл про основную арифметику.";
        String choice1_2 = "Калькулятор выдает случайные числа вместо результатов вычислений. Начальник в шоке.";
        String choice2 = "Ты написал простой и понятный код. Калькулятор работает отлично.";
        String choice2_1 = "Начальник доволен, и ты получаешь повышение. Теперь ты пишешь калькуляторы для космических кораблей.";
        String choice3 = "Твой калькулятор стал настоящей звездой компании. Он научился петь.";
        String choice3_1 = "Тебя переводят в отдел искусственного интеллекта для создания поющего робота.";

        switch (choice) {
            case (0):
                texts.add(text);
                texts.add(text2);
                texts.add(text3);
                texts.add(text4);
                texts.add(text5);
                break;
            case (1):
                texts.add(choice1);
                texts.add(choice1_2);
                break;
            case (2):
                texts.add(choice2);
                texts.add(choice2_1);
                break;
            case (3):
                texts.add(choice3);
                texts.add(choice3_1);
                break;
        }
        return texts;
    }

    public static List<String> javaMiddle(int choice) {
        List<String> texts = new ArrayList<>();
        String text = "Ты, мидл, получил задачу создать API. Не простое API, а такое, чтобы даже чайник мог понять, как им пользоваться. Но, конечно, без документации.";
        String text2 = "Клиент требует, чтобы API работало быстрее, чем скорость света, и при этом было надежнее швейцарских часов. И все это за вчера.";
        String text3 = "Задача: написать REST API для приложения, которое будет искать самую смешную шутку в интернете. Да, именно так. Шутку.";
        String text4 = "Если не справишься, придется объяснять начальнику, почему пользователи не могут найти ни одной смешной шутки. И да, ты будешь виноват в мировом заговоре против юмора.";
        String text5 = "Выбери действие: \n1. Использовать серверные лампочки для обработки запросов (надежно и быстро, правда?). \n2. Написать API на языке ассемблера, чтобы показать всем, какой ты крутой. \n3. Сделать API, который будет генерировать случайные шутки, даже если они будут совсем не смешными.";
        String choice1 = "Лампочки перегорели, а API упало. Клиент в ярости, но зато у тебя теперь есть отличная коллекция перегоревших лампочек.";
        String choice1_1 = "Тебя повысили до главного осветителя компании.";
        String choice2 = "API работает быстро, но никто не может его понять, кроме тебя и твоего кота.";
        String choice2_1 = "Тебя пригласили на конференцию для ассемблеристов, где тебя считают богом программирования.";
        String choice3 = "API генерирует шутки, но они настолько плохие, что пользователи начинают плакать от смеха (или от отчаяния).";
        String choice3_1 = "Тебя назначают главным юмористом компании, и ты проводишь корпоративы, где рассказываешь свои собственные шутки.";
        switch (choice) {
            case (0):
                texts.add(text);
                texts.add(text2);
                texts.add(text3);
                texts.add(text4);
                texts.add(text5);
                break;
            case (1):
                texts.add(choice1);
                texts.add(choice1_1);
                break;
            case (2):
                texts.add(choice2);
                texts.add(choice2_1);
                break;
            case (3):
                texts.add(choice3);
                texts.add(choice3_1);
                break;
        }
        return texts;
    }

    public static List<String> javaSenior(int choice) {
        List<String> texts = new ArrayList<>();
        String text = "Ты синьор, бог программирования. Тебе поручили создать систему искусственного интеллекта, которая сможет написать лучшее любовное письмо в мире. И все это за выходные.";
        String text2 = "Клиент - романтик, но очень требовательный. Он хочет, чтобы ИИ не просто писал письма, а еще и сочинял стихи, играл на скрипке и варил кофе. И все это одновременно.";
        String text3 = "Задача: создать ИИ, который не только напишет идеальное любовное письмо, но и сможет поддержать философский спор о смысле жизни.";
        String text4 = "Если не справишься, придется объяснять клиенту, почему его искусственный любовник не умеет завязывать шнурки. И да, ты будешь виноват в одиночестве всех романтиков на планете.";
        String text5 = "Выбери действие: \n1. Использовать нейронные сети, которые обучались на всех любовных романах когда-либо написанных. \n2. Создать ИИ на основе древних философских трактатов и кода Леонардо да Винчи. \n3. Сделать ИИ, который просто будет копировать письма великих любовников, но с случайными ошибками.";
        String choice1 = "Нейронная сеть выдала слишком поэтичные письма. Клиент плачет от счастья, но его девушка думает, что это спам.";
        String choice1_1 = "Тебя назначают главным поэтом компании, и ты пишешь рекламные слоганы для туалетной бумаги.";
        String choice2 = "ИИ пишет письма, полные философских рассуждений о любви, но совершенно непонятные для обычных людей.";
        String choice2_1 = "Тебя приглашают читать лекции в университете, но студенты засыпают на твоих занятиях.";
        String choice3 = "ИИ пишет письма с орфографическими ошибками и грамматическими несогласованиями. Клиент в шоке.";
        String choice3_1 = "Тебя отправляют на курсы повышения квалификации по русскому языку.";
        switch (choice) {
            case (0):
                texts.add(text);
                texts.add(text2);
                texts.add(text3);
                texts.add(text4);
                texts.add(text5);
                break;
            case (1):
                texts.add(choice1);
                texts.add(choice1_1);
                break;
            case (2):
                texts.add(choice2);
                texts.add(choice2_1);
                break;
            case (3):
                texts.add(choice3);
                texts.add(choice3_1);
                break;
        }
        return texts;
    }

    public static List<String> phpDeveloper(int choice) {
        List<String> texts = new ArrayList<>();
        String text = "Ты, великий PHP-гуру, был вызван на другую планету, чтобы спасти галактику от нашествия инопланетных багов. Твое оружие - PHP.";
        String text2 = "Инопланетяне написали свой код на языке, который напоминает смесь клингонского и эльфийского. Но не волнуйся, у тебя есть переводчик - старый добрый eval().";
        String text3 = "Задача: написать PHP-скрипт, который создаст защитный щит вокруг планеты, способный отразить любую атаку. И, конечно же, чтобы этот щит мог варить кофе.";
        String text4 = "Если не справишься, галактика погибнет, а ты будешь виноват в конце света. И да, инопланетяне очень любят пасту.";
        String text5 = "Выбери действие: \n1. Использовать рекурсивные функции, чтобы создать бесконечный цикл, который будет отпугивать врагов. \n2. Создать класс 'Бог', который будет управлять всем в галактике. \n3. Использовать include для подключения сторонних библиотек, написанных на языке эльфов.";
        String choice1 = "Твой скрипт вызвал бесконечную рекурсию, и планета замерзла. Инопланетяне теперь выращивают ледяные огурцы.";
        String choice1_1 = "Тебя назначают повелителем льда, и ты проводишь зимы на Южном полюсе.";
        String choice2 = "Твой класс 'Бог' стал настолько всемогущим, что начал создавать новые галактики. Но он забыл про кофе.";
        String choice2_1 = "Тебя провозглашают богом программирования, и ты создаешь свою собственную религию.";
        String choice3 = "Твой код был взломан эльфами, и они используют твой защитный щит для того, чтобы жарить мармеладки.";
        String choice3_1 = "Тебя приглашают на чайную церемонию с эльфами, где ты учишься варить эльфийский чай.";
        switch (choice) {
            case (0):
                texts.add(text);
                texts.add(text2);
                texts.add(text3);
                texts.add(text4);
                texts.add(text5);
                break;
            case (1):
                texts.add(choice1);
                texts.add(choice1_1);
                break;
            case (2):
                texts.add(choice2);
                texts.add(choice2_1);
                break;
            case (3):
                texts.add(choice3);
                texts.add(choice3_1);
                break;
        }
        return texts;
    }

    public static String[] phpDream() {
        String[] chimpanzeeHead = {
                "     _____",
                "   /       \\",
                "  /  _   _  \\",
                " /  / \\ / \\  \\",
                "|  |  O O  |  |",
                "|  |   ^   |  |",
                "|   \\_____/   |",
                " \\           /",
                "  \\_________/"
        };

        return chimpanzeeHead;
    }
}
