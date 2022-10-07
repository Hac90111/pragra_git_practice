import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    List <Contact> contacts= new ArrayList<>();

    //adding contact to the list
    public void addContact(Contact contact){
        contact.setContactType(ContactType.PERSONAL);
        int index= checkIfExists(contact.getPhone());
        if (index>=0){
            contacts.add(index, contact);
        }else {
            contacts.add(contact);
        }

    }

     // check if the contact already exists

    public int checkIfExists(String phone){
        for (int i = 0; i <contacts.size(); i++) {
            if (contacts.get(i).getPhone().equals(phone)){
                return i;
            }
        }
        return -1;

    }

    // searching by phone number
    public Contact getByPhone(String phone){
        if (!StringUtils.isNumeric(phone)) throw new RuntimeException("Phone is not valid");

        int exist= checkIfExists(phone);
        if (exist>=0){
            return contacts.get(exist);
        }else {
            throw new RuntimeException("Phone doesn't exists");
        }

    }
}
