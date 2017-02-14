function Kanban(){
	this._cards = [];

	this.addCard = function(newCard){
		this._cards.push(newCard);
	}

	this.getCards = function(){
		return this._cards;
	}

}