package ex27;

public class Validation {

    public void validateInput(UserInfo user) {
        validateFirstName(user.firstName);
        validateLastName(user.lastName);
        validateZipcode(user.zip);
        validateID(user.id);
    }

    public void validateID(String id) {
        char[] idArr = id.toCharArray();
        boolean flag = false;

        if (id.length() > 7) {
            System.out.println("The employee ID must be in the format of AA-1234");
            return;
        }

        if (!Character.isLetter(idArr[0]) && !Character.isLetter(idArr[1])) {
            System.out.println("The employee ID must be in the format of AA-1234");
            return;
        }

        if (idArr[2] == '-') {
            System.out.println("The employee ID must be in the format of AA-1234");
            return;
        }

        for (int i = 3; i < 6; i++) {
            if (!Character.isDigit(idArr[i])) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The employee ID must be in the format of AA-1234");
            return;
        }
    }

    public void validateZipcode(String zip) {
        if (zip.matches("[a-z A-Z]+") || zip.length() != 5)
            System.out.println("The zipcode must be a 5 digit number.");
    }

    public void validateFirstName(String name) {
        if (name.isBlank())
            System.out.println("The first name must be filled in.");

        else if (name.length() < 2)
            System.out.println("The first name must be at least 2 characters long.");
    }

    public void validateLastName(String name) {
        if (name.isBlank())
            System.out.println("The last name must be filled in.");

        else if (name.length() < 2)
            System.out.println("The last name must be at least 2 characters long.");
    }
}
