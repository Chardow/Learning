var app = app || {};

(function(kanbanApp) {
     $( function() {
    $( "#1, #2, #3, #4" ).sortable({
      connectWith: ".sortable"
    }).disableSelection();
  } );
    var kanban = new Kanban();


    $('#add').click(function(ev) {
        ev.preventDefault();
        debugger;
        var card = new Card();
        card.setName($('#name').val());
        card.setColumn($('#column').val());
        kanban.addCard(card);

        

        observeChanges();
    });

    var ids = [];
    function observeChanges() {
        var cards = kanban.getCards();
        var col1 = $('#1');
        var col2 = $('#2');
        var col3 = $('#3');
        var col4 = $('#4');
        cards.forEach(function(c) {
            var isExist = ids.filter(function(id) {
                return id === c.getId();
            });
            if (isExist.length<=0) {
                switch (c.getColumn()) {
                    case 1:
                        col1.append('<li>'+c.getName()+'</li>');
                    break;
                    case 2:
                        col2.append('<li>'+c.getName()+'</li>');
                    break;
                    case 3:
                        col3.append('<li>'+c.getName()+'</li>');
                    break;
                    case 4:
                        col4.append('<li>'+c.getName()+'</li>');
                    break;
                }
                ids.push(c.getId());
            }
        });
    }
}(app));
