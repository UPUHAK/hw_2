public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog=8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var boxer1=78.2;
        var boxer2=82.7;
        var weightBouthBoxers=boxer1+boxer2;
        System.out.println(weightBouthBoxers);
        var weightDifference=boxer2-boxer1;
        System.out.println(weightDifference);
        var difference=boxer2%boxer1;
        System.out.println(difference);
        var totalWorkingHours=640;
        var employeesNumber=totalWorkingHours/8;
        System.out.println("Всего работников в компании "+employeesNumber+" человек");
        var moreEmployeesNumber = employeesNumber+94;
        System.out.println("Если в компании работает "+moreEmployeesNumber+" человек, то всего "+moreEmployeesNumber*8+" часов работы может быть поделено между сотрудниками ");
    }
}
