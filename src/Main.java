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

    }
}