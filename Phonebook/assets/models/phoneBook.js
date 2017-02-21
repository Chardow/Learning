function PhoneBook(){
	this._contacts = [];

	this.setContact = function(contact){
		this._contacts.push(contact);
	}

	this.getContacts = function(){
		return this._contacts;
	}

	this.removeContact = function(id){
		for(var i = 0; i<this._contacts.length;i++){
			if(this._contacts[i].getId() == id){
				this._contacts.splice(i,1);
			}
		}
	}
}