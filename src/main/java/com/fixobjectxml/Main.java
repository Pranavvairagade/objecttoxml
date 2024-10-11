package com.fixobjectxml;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws JAXBException {
            Student student = new Student(1,"Sam","sam@email.com");
            convertToXml(student);
    }

    private static void convertToXml(Student student) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(student, stringWriter);
        String xmlContent = stringWriter.toString();
        System.out.println(xmlContent);


    }

}
