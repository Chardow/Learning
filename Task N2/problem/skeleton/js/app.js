var app = app || {};

(function(recipeBook) {
    var book = new Book();
    
    $('#add_book').click(function(ev) {
        
        ev.preventDefault();
         var recipe = new Recipe();
        recipe.setName($('#name').val());
        recipe.setImage($('#image').val());
        recipe.setCategory($('#category').val());
        recipe.setRating($('#rating').val());
		book.addRecipe(recipe);
        clearForm();
        loadData();
    });

    $("#clear_book").click(function(ev) {
		 ev.preventDefault();
        clearForm();
    });

    function clearForm(){
        $('#name').val('');
        $('#image').val('');
        $('#category').val('meat');
        $('#rating').val('');
    }
    $(document).on('click','.remove',function(ev){
       
        var id = $(ev.target).data('id');
        book.removeRecipe(id);
        loadData();
    });

    loadData();

    function loadData() {
        var meat = book.getRecipes().filter(function(r) {
            return r._category === "meat";
        });

        var vegan = book.getRecipes().filter(function(r) {
            return r._category === "vegan";
        });

        var dessert = book.getRecipes().filter(function(r) {
            return r._category === "dessert";
        });

        var source   = $("#recipe-trmplate").html();
        var template = Handlebars.compile(source);

        var contextMeat = {meat:meat};
        var contextvegan = {meat:vegan};
        var contextdessert = {meat:dessert};
        var html    = template(contextMeat);
        var html2    = template(contextvegan);
        var html3    = template(contextdessert);

        $('#meat_recipes').html(html);
        $('#vegan_recipes').html(html2);
        $('#dessert_recipes').html(html3);
    }

}(app));
