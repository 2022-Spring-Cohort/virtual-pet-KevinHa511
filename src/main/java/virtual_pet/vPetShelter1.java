package virtual_pet;

import java.util.ArrayList;

public class vPetShelter1 {

        ArrayList<VirtualPets> shelterPets;

        public vPetShelter1() {
            this.shelterPets = new ArrayList<VirtualPets>();
            shelterPets.add(new OrganicDog("Rusty", "Organic", 50, 50, 50, 50));
            shelterPets.add(new OrganicCat("Mako", "Organic", 50, 50, 50, 50));
            shelterPets.add(new RoboCat("Gohan", "Robotic", 67, 67, 95));
            shelterPets.add(new RoboDog("Diesel", "Robotic", 50, 50, 50));
        }

        public ArrayList<VirtualPets> getPets() {
            return shelterPets;
        }

        public VirtualPets getPetByName(String name) {
            for (VirtualPets currentPet : shelterPets) {
                if (currentPet.getName().equalsIgnoreCase(name)) {
                    return currentPet;
                }
            }
            return null;
        }

        public VirtualPets getPetByDescription(String description) {
            for (VirtualPets currentPet: shelterPets) {
                if (currentPet.getDescription().equalsIgnoreCase(description)) {
                    return currentPet;
                }
            }
            return null;
        }

        public void adoptPet(VirtualPets pet) {
            shelterPets.remove(pet);
        }

        public void surrenderPet(VirtualPets pet) {
            shelterPets.add(pet);
        }

        public void feedAllPets() {
            for (VirtualPets currentPet : shelterPets) {
                currentPet.energize();
            }
        }

        public void GiveWaterToAll() {
            for (VirtualPets currentPet : shelterPets) {
                if(currentPet instanceof OrganicPets){
                    currentPet.fluid();
                }
                if(currentPet instanceof RoboPets){
                    currentPet.fluid();
                }
            }
        }

        public void playAll() {
            for (VirtualPets currentPet : shelterPets) {
                currentPet.playPet();
            }
        }

        public void tick() {
            for (VirtualPets currentPet : shelterPets) {
                currentPet.tick();
            }

        }

    }
