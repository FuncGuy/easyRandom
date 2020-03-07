import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class Test {

    public static void main(String[] args)  {

        Field[] fields = Person.class.getDeclaredFields();

        Field nickNamesField = fields[0];

        System.out.println("field name = " + nickNamesField.getName());

        System.out.println("field type = " + nickNamesField.getType());

        Type genericType = nickNamesField.getGenericType();

        System.out.println("field genericType = " + genericType);

        ParameterizedType parameterizedType = (ParameterizedType) genericType;

        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

        Type actualTypeArgument = actualTypeArguments[0];

        System.out.println("actualTypeArgument = " + actualTypeArgument);

    }
}
class Person {

    private List<String> nickNames;

}

class Address{
    private String streetAddress;

    public String getStreetAddress(){
        return streetAddress;
    }
}
