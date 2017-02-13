function Recipe(){
	this._id = Recipe._count++;
	this._name = '';
	this._rating = '';
	this._image = '';
	this._category ='';
this.setName = function(recipeName){
	this._name = recipeName;
}
this.setImage = function(imageUrl){
	this._image = imageUrl;
}
this.setCategory = function(recipeCategory){
	this._category = recipeCategory;
}
this.setRating = function(recipeRating){
	this._rating = recipeRating;
}
this.getId = function(){
	return this._id;
}
}


Recipe._count=0;