
function Card(){

this._id = Card._count++;
this._name = '';
this._column;
	
	this.setName = function(cardName){
		this._name = cardName;
	}
	this.setColumn = function(columnIndex){
		this._column=parseInt(columnIndex);
	}
	
	this.getColumn = function(){
		return this._column;
	}
	this.getName = function(){
		return this._name;
	}
	this.getId = function(){
		return this._id;
	}
}

Card._count=0;