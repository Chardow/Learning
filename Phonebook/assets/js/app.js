var app = app || {};
	(function(phoneBook){
		var phoneBook = new PhoneBook();
		$('#addContact').click(function(ev){
			ev.preventDefault();
			var contact = new Contact();
			contact.setContactName($('#contactName').val());
			contact.setContactNumber($('#contactNumber').val());
			contact.setContactLocation($('#contactLocation').val());
				
			phoneBook.setContact(contact);
			clearForm();
			
		});
		function clearForm(){
			$('#contactName').val('');
			$('#contactNumber').val('');
			$('#contactLocation').val('');
		}
		
	}(app));