fish.View.configure({manage: true, syncRender:true}); //全局设置fish使用扩展的功能

define(["hbs!../../templates/index.html"],function(aaa){
    var view = fish.View.extend({
        template: aaa,
        afterRender: $("#app").css('color', 'red')
    });
    return view;
})
