package javaProStanislav.lesson12_24042023.contacts;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ContactManager {
    private HashSet<Contact> contacts = new HashSet<>();;

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            System.out.println("Контакт " + contact.getName() + " добавлен");
        } else {
            System.out.println("Контакт уже существует.");
        }
    }

    public void removeContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.remove(contact);
            System.out.println("Контакт " + contact.getName() + "удален");
        } else {
            System.out.println("Контакт не существует.");
        }
    }

    public void getAllContacts() {
        Comparator<Contact> comparator = new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        TreeSet<Contact> contactsSorted = new TreeSet<>(comparator);
        contactsSorted.addAll(contacts);
        System.out.println(contactsSorted);
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        System.out.println("Контакт не найден.");
        return null;
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        System.out.println("Контакт не найден.");
        return null;
    }
}
