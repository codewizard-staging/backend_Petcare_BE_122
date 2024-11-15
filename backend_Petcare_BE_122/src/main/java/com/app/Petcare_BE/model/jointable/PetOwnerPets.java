package com.app.Petcare_BE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.Petcare_BE.model.Manager;
import com.app.Petcare_BE.model.Pet;
import com.app.Petcare_BE.model.PetCareCenter;
import com.app.Petcare_BE.model.PetOwner;
import com.app.Petcare_BE.model.Document;
import com.app.Petcare_BE.model.PetService;
import com.app.Petcare_BE.enums.PetServiceType;
import com.app.Petcare_BE.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"petcare_be_060\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}