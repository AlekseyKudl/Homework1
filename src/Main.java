public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Мир");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var allWeight = firstBoxerWeight + secondBoxerWeight;
        var difWeightfBoxers = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Общий вес " + allWeight + " кг Вес бойца 1 " + firstBoxerWeight + "кг " + "Вес бойца 2 " + secondBoxerWeight + "кг " + "Разница весов " + difWeightfBoxers + "кг");
        difWeightfBoxers = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Вес 1 бойца " + firstBoxerWeight + "кг " + "Вес 2 бойца " + secondBoxerWeight + "кг " + "Разница в весе " + difWeightfBoxers + "кг");

        var workTimeAll = 640;
        var timeForEach = 8;
        var quantityInCompany = workTimeAll / timeForEach;
        System.out.println("Всего работников в компании – " + quantityInCompany + " человек");
        quantityInCompany = quantityInCompany + 94;
        workTimeAll = timeForEach * quantityInCompany;
        System.out.println("Если в компании работает " + quantityInCompany + " человек, то всего " + workTimeAll + " часов работы может быть поделено между сотрудниками");
        //задание 4
        //задача 1
        int day = 35000;
        byte hour = 22;
        short step = 10000;
        long second = 1000000L;
        float densyty = 2.88754f;
        double path = 0.123456789;
        System.out.println("Значение переменной" + " day" + " с типом " + "int" + " равно " + day);
        System.out.println("Значение переменной" + " hour" + " с типом " + "byte" + " равно " + hour);
        System.out.println("Значение переменной" + " step" + " с типом " + "short" + " равно " + step);
        System.out.println("Значение переменной" + " second" + " с типом " + "long" + " равно " + second);
        System.out.println("Значение переменной" + " densyty" + " с типом " + "float" + " равно " + densyty);
        System.out.println("Значение переменной" + " path" + " с типом " + "double" + " равно " + path);
        //задача 2
        densyty = 27.12f;
        second = 987678965549L;
        path = 2.786;
        boolean perfect = densyty < path;
        step = 569;
        day = -159;
        step = 27897;
        hour = 67;
        System.out.println(perfect);
        System.out.println("Значение переменной" + " day" + " с типом " + "int" + " равно " + day);
        System.out.println("Значение переменной" + " hour" + " с типом " + "byte" + " равно " + hour);
        System.out.println("Значение переменной" + " step" + " с типом " + "short" + " равно " + step);
        System.out.println("Значение переменной" + " second" + " с типом " + "long" + " равно " + second);
        System.out.println("Значение переменной" + " densyty" + " с типом " + "float" + " равно " + densyty);
        System.out.println("Значение переменной" + " path" + " с типом " + "double" + " равно " + path);
        //задача 3
        byte studentLP = 23;
        byte studentAS = 27;
        byte studentEA = 30;
        short pages = 480;
        int pagesForOneStudent = pages / (studentLP + studentAS + studentEA);
        System.out.println("На каждого ученика рассчитано " + pagesForOneStudent + " листов бумаги");
        //задача 4
        int bottle = 16;
        int time = 2;
        System.out.println("За " + time + " минуты машина произвела бутылок " + bottle + " штук");
        int bottlePerMin = 16/2;
        time = 20;
        bottle = bottlePerMin * time;
        System.out.println("За " + time + " минут машина произвела бутылок " + bottle + " штук");
        time = 24 * 60;
        bottle = bottlePerMin * time;
        time = time / (24 * 60);
        System.out.println("За " + time + " сутки машина произвела бутылок " + bottle + " штук");
        time = 24 * 60 * 3;
        bottle = bottlePerMin * time;
        time = time / (24 * 60);
        System.out.println("За " + time + " дня машина произвела бутылок " + bottle + " штук");
        time = 24 * 60 * 30;
        bottle = bottlePerMin * time;
        time = time / (24 * 60 * 30);
        System.out.println("За " + time + " месяц (считаем за октябрь) машина произвела бутылок " + bottle + " штук");
        //задача 5
        int tinOfPaint = 120;
        int tinOfWhitePaintPerClass = 2;
        int tinOfBrawnPaintPerClass = 4;
        int quantityOfClass = tinOfPaint / (tinOfWhitePaintPerClass + tinOfBrawnPaintPerClass);
        tinOfWhitePaintPerClass = 2 * quantityOfClass;
        tinOfBrawnPaintPerClass = 4 * quantityOfClass;
        System.out.println("В школе, где " + quantityOfClass + " классов, нужно " + tinOfWhitePaintPerClass + " банок белой краски и " + tinOfBrawnPaintPerClass + " банок коричневой краски");
        //задача 6
        //Бананы – 5 штук (1 банан - 80 грамм);
        //Молоко – 200 мл (100 мл = 105 грамм);
        //Мороженое пломбир – 2 брикета по 100 грамм;
        //Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        float breakfast = (banana + milk + iceCream + eggs) / 1000f;
        System.out.println("вес спорт-завтрака " +  breakfast + "кг");
        //задача 7

        float minGramm = 0.250f;
        float maxGramm = 0.500f;
        float middleGramm = (minGramm + maxGramm)/2;
        int weightNeed = 7;
        float dayMax =weightNeed / minGramm;
        float dayMin = weightNeed / maxGramm;
        float dayMiddle =  (dayMax + dayMin) / 2;
        float dayMaxMin = weightNeed / middleGramm;
        System.out.println("За " +  dayMax + " дней, если по 250 г/день " + "За " +  dayMin + " дней, если по 500 г/день " + "За " +  dayMiddle + " дней в среднем " + "За " +  dayMaxMin + " дней при средней потере веса в день");

        //задача 8
        int nowM = 67760;
        int nowD = 83690;
        int nowK = 76280;
        float nextZP = nowM * 1.1f;
        float differentNextZPY = (nextZP - nowM) * 12;
        System.out.println("Маша теперь получает " + nextZP + " рублей в месяц. Годовой доход вырос на " + differentNextZPY + " рублей");
        nextZP = nowD * 1.1f;
        differentNextZPY = (nextZP - nowD) * 12;
        System.out.println("Денис теперь получает " + nextZP + " рублей в месяц. Годовой доход вырос на " + differentNextZPY + " рублей");
        nextZP = nowK * 1.1f;
        differentNextZPY = (nextZP - nowK) * 12;
        System.out.println("Кристина теперь получает " + nextZP + " рублей в месяц. Годовой доход вырос на " + differentNextZPY + " рублей");













    }
}