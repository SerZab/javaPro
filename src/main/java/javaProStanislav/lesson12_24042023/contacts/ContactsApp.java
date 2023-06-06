package javaProStanislav.lesson12_24042023.contacts;

public class ContactsApp {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Sergey", "123456789");
        Contact contact2 = new Contact("Nikolay", "987654321");
        Contact contact3 = new Contact("Olga", "2343432345");
        Contact contact4 = new Contact("Vitalii", "987876765");

        ContactManager manager = new ContactManager();
        manager.addContact(contact1);
        manager.addContact(contact2);
        manager.addContact(contact3);
        manager.addContact(contact4);

        manager.getAllContacts();
        manager.addContact(contact3); // контакт существует

        System.out.println(manager.getContactByName("Nikolay")); // выводит контакт с именем
        System.out.println(manager.getContactByPhoneNumber("2343432345")); // выводит контакт с номером
        manager.removeContact(contact3); // удаляет контакт из списка

    }
}
