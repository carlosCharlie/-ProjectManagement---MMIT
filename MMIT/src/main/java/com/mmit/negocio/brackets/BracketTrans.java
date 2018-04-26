package com.mmit.negocio.brackets;

import com.mmit.negocio.equipos.EquipoTrans;

public class BracketTrans {
	
	private EquipoTrans[] bracket;

	
	public BracketTrans(){
		bracket = new EquipoTrans[31];
		for(int i = 0; i< bracket.length; i++){
			bracket[i] = null;
		}
	}
	
	
	public EquipoTrans getEquipoinPosition(int pos){
		return bracket[pos];
	}
	
	public void setEquipoinPosition(int pos, EquipoTrans value){
		bracket[pos]= value;
	}
}
