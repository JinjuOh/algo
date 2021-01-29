import java.util.Arrays;
import java.util.List;

// http://codingdojang.com/scode/410?answer_mode=hide
public class PersonName {

    static String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
    static List<String> persons;

    public static void main(String[] args) {
        persons = Arrays.asList(names.split(","));
        System.out.println("김씨 "+countByFamilyName("김")+"명");
        System.out.println("이씨 "+countByFamilyName("이")+"명");
        System.out.println("이재영씨 "+countByName("이재영")+"명");
        removeSame();
        System.out.println();
        removeSameAndOrderByNameASC();
    }

    private static long countByFamilyName(String familyName) {
        return persons.stream().filter(p-> p.startsWith(familyName)).count();
    }

    private static long countByName(String name) {
        return persons.stream().filter(p-> p.equals(name)).count();
    }

    private static void removeSame() {
        persons.stream().distinct().forEach(p-> System.out.print(p+" "));
    }

    private static void removeSameAndOrderByNameASC() {
        persons.stream().distinct().sorted().forEach(p-> System.out.print(p+" "));
    }
}
