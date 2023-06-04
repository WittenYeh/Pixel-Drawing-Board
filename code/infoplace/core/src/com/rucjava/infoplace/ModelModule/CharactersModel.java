package com.rucjava.infoplace.ModelModule;

import com.rucjava.infoplace.ModelModule.ModelUtils.CharacterState;
import com.rucjava.infoplace.ModelModule.ModelUtils.SingleCharacterModel;

import java.util.HashMap;

public class CharactersModel {
    HashMap<String, SingleCharacterModel> characterModelHashMap;

    public CharactersModel() {
        this.characterModelHashMap = new HashMap<>();
    }

    public void updateCharacters() {
        for (SingleCharacterModel singleCharacter : characterModelHashMap.values()) {
            if (singleCharacter.getCharacterState() == CharacterState.MOVE) {
                singleCharacter.updateCharacterPosition();
                singleCharacter.updateCharacterMovement();
            }
        }
    }
    public void setCharacterState(String characterName, CharacterState newState) {
        characterModelHashMap.get(characterName).setCharacterState(newState);
    }
}