package edu.uco.budget.domain;

import edu.uco.budget.crosscuting.helper.UUIDhelper;

import java.util.UUID;

import static edu.uco.budget.crosscuting.helper.StringHelper.EMPTY;
import static edu.uco.budget.crosscuting.helper.UUIDhelper.*;

public final class PersonDTO {
    private UUID id;
    private String idCard;
    private String firstName;
    private String secondName;
    private String firstSurname;
    private String secondSurname;

    public PersonDTO() {
        setId(getDefaultUUID(id));
         setIdCard(EMPTY);
         setFirstName(EMPTY);
         setSecondName(EMPTY);
         setFirstSurname(EMPTY);
         setSecondSurname(EMPTY);
    }

    public PersonDTO(final UUID id, final String idCard, final String firstName, final String secondName, final String firstSurname,
                     final String secondSurname){
        setId(id);
        setIdCard(idCard);
        setFirstName(firstName);
        setSecondName(secondName);
        setFirstSurname(firstSurname);
        setSecondSurname(secondSurname);
    }

    public static final PersonDTO create(final UUID id, final String idCard, final String firstName, final String secondName,
                                         final String firstSurname, final String secondSurname){
        return new PersonDTO(id,idCard,firstName,secondName,firstSurname,secondSurname);
    }

    public static final PersonDTO create(final UUID id){
        return new PersonDTO(id,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY);
    }

    public static final PersonDTO create(final String id, final String idCard, final String firstName, final String secondName,
                                         final String firstSurname, final String secondSurname){
        return new PersonDTO(getUUIDFromString(id),idCard,firstName,secondName,firstSurname,secondSurname);
    }

    public final UUID getId() {
        return id;
    }

    public final void setId(UUID id) {
        this.id = getDefaultUUID(id);
    }

    public final String getIdCard() {
        return idCard;
    }

    public final void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getSecondName() {
        return secondName;
    }

    public final void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public final String getFirstSurname() {
        return firstSurname;
    }

    public final void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public final String getSecondSurname() {
        return secondSurname;
    }

    public final void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public final String getUUIDAsString(){
        return UUIDhelper.getUUIDAsString(getId());
    }

    public final boolean exist(){
        return !isDefaultUUID(id);
    }

    public final boolean notExist(){
        return !exist();
    }
}
