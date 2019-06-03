package com.zipcodewilmington.assessment1.part3;
import java.util.ArrayList;
import static com.zipcodewilmington.assessment1.part2.ArrayUtils.getNumberOfOccurrences;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name=name;
        this.pets=pets;
        if(pets!=null&&pets.length>0)for (Pet pet:pets)pet.setOwner(this);
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(this.pets==null)this.pets=new Pet[]{pet};
        else {
            Pet[] newPets = new Pet[this.pets.length + 1];
            for (int i = 0; i < this.pets.length; i++) {
                newPets[i] = this.pets[i];
            }
            newPets[this.pets.length] = pet;
            this.pets = newPets;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if (this.pets.length>1) {
            Integer howMany = getNumberOfOccurrences(this.pets, pet);
            Pet[] answer = new Pet[this.pets.length - howMany];
            Integer pointer = 0;
            for (int i = 0; i < this.pets.length; i++) {
                if (!this.pets[i].equals(pet)) answer[pointer++] = this.pets[i];
            }
        }
        else if(this.pets[0].equals(pet))this.pets[0]=null;
        /*     if (this.pets.length>1) {
            Pet[] newPets = new Pet[this.pets.length - 1];
            Integer pointer = 0;
            for (int i = 0; i < this.pets.length; i++) {
                if (this.pets[i].equals(pet)) newPets[pointer++] = this.pets[i];
            }
            this.pets = newPets;
        }
        else if();
        */
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0; i < this.pets.length; i++) {
            if(this.pets[i].equals(pet))return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestSoFar = this.pets[0].getAge();
        for (int i = 0; i < this.pets.length; i++) {
            if(youngestSoFar>this.pets[i].getAge())youngestSoFar=this.pets[i].getAge();
        }
        return youngestSoFar;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestSoFar = this.pets[0].getAge();
        for (int i = 0; i < this.pets.length; i++) {
            if(oldestSoFar<this.pets[i].getAge())oldestSoFar=this.pets[i].getAge();
        }
        return oldestSoFar;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sum=(float)this.pets[0].getAge();
        for (int i = 1; i < this.pets.length; i++) {
            sum+=this.pets[i].getAge();
        }
        return sum/(float)this.pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
