function Book(){
	this._recipes = [];

	this.addRecipe = function(recipe){
	
	this._recipes.push(recipe);
	}
	this.removeRecipe = function(recipeId){
	var conf = confirm('Are you sure about that?');
	if(conf){
		for(var i=0; i<this._recipes.length; i++) {
		 	if(this._recipes[i].getId() == recipeId) {
		 		this._recipes.splice(i, 1);
		 	}
		 }
	}
	
}
this.getRecipes = function(){
	return this._recipes;
}
}

