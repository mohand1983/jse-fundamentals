package fr.aelion.helpers.dto;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DtoMapper {
    /**
     * Transform the object m to object o
     * @param m Media object i want to transforms
     * @param dto Dto object i want to obtain
     * @return object dto Object
     */

    /*public Field[] map(Object m, Object dto){
        //Introspect a class to get declared fields
        Field[] oFields= dto.getClass().getDeclaredFields();
        return oFields;
    }*/
    public String[] map(Object m, Object dto) {
        // Introspect a class to get declared fields
        Field[] oFields = dto.getClass().getDeclaredFields();

        // Sets a String array (property names)
        String[] properties = new String[oFields.length];

        // Loop over all properties from oFields and store name of properties to fields array
        int i = 0;
        for (Field oField : oFields) {
            properties[i] = oField.getName();
            i++;
        }


        // Mutate the fields array in reverse order of String (mean from Z to A)
        Arrays.sort(properties, Collections.reverseOrder());

        return properties;
    }
    // une autre façon de faire
    /*
       public String[] map(Object m, Object dto) {
        // Introspect a class to get declared fields
        List<Field> oFields = new ArrayList<Field>(Arrays.asList(dto.getClass().getDeclaredFields()));

        List<String> fields = oFields.stream()
                .map(oField -> oField.getName())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        return fields.toArray(new String[0]);
    }
     */

}
