import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        Faculty aeroastro = new Faculty("Aviation communications");
        Institute vatu = new Institute("vatu", "University square, 1");
        Institute mojaika = new Institute("mojaika", "University square, 1");
        aeroastro.setInstitutes(new Institute[]{vatu, mojaika});

        ResearchAssociate employee1 = new ResearchAssociate(1, "Dmitro Pyrotechnic", "dp@gmail.com", "vatu");
        ResearchAssociate employee2 = new ResearchAssociate(2, "Yaroslav Lazutchick", "yl@mail.ru", "vatu");
        ResearchAssociate employee3 = new ResearchAssociate(3, "Valerik Sniper", "vs@yandex.ru", "mojaika");
        ResearchAssociate employee4 = new ResearchAssociate(4, "Danil Chorni", "dc@vk.com", "mojaika");
        vatu.setEmployees(new ResearchAssociate[]{employee1, employee2});
        mojaika.setEmployees(new ResearchAssociate[]{employee3, employee4});

        Project project1 = new Project("Ratnik 2023",
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "11.09.2001" ),
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "24.02.2022" ), new Participation(5));
        employee1.setProjects(new Project[]{project1});

        Course course1 = new Course("Sroevaya pdgotovka", 25, 60);
        Lecturer lecturer1 = new Lecturer(5, "Donnie Duh", "dodu@gmail.com", "mojaika");
        lecturer1.setCourses(new Course[]{course1});

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(6,
                "Sergey Snickers", "ss@outlook.com", "admin");

        Institute[] institutes = aeroastro.getInstitutes();
        System.out.println("Institutes on " + aeroastro.getName() + ": \n");
        for (Institute institute : institutes) {
            System.out.println(institute.getName());
        }
        System.out.println();

        ResearchAssociate[] researchEconomy = vatu.getEmployees();
        System.out.println("Research Associates on " + vatu.getName() + ": \n");
        for (ResearchAssociate researchAssociate : researchEconomy) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        ResearchAssociate[] researchFinance = mojaika.getEmployees();
        System.out.println("Research Associates on " + mojaika.getName() + ": \n");
        for (ResearchAssociate researchAssociate : researchFinance) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        Project[] projects = employee1.getProjects();
        System.out.println("Projects of " + employee1.getName() + ": \n");
        for (Project project : projects) {
            System.out.println(project.getName());
        }
        System.out.println();

        Course[] courses = lecturer1.getCourses();
        System.out.println("Courses of " + lecturer1.getName() + ": \n");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println();
        System.out.println("Admin:");
        System.out.println();
        System.out.println(administrativeEmployee.getName());
    }
}
