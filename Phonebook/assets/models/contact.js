function Contact(){
this._id = Contact._count++;
this._contactName = '';
this._contactNumber;
this._contactLocation = '';

	this.setContactName = function(name){
		this._contactName = name;
	}
	this.setContactNumber = function(number){
		this._contactNumber = parseInt(number);
	}
	this.setContactLocation = function(location){
		this._contactLocation = location;
	}

	this.getId = function(){
		return this._id;
	}
}
Contact._count=0;