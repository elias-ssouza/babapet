window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Localizacao = window.blockly.js.blockly.Localizacao || {};

/**
 * Localização
 */
window.blockly.js.blockly.Localizacao.obter_coordenadas = function() {
 var item, coordenadas, url;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_item) {
      item = sender_item;
    coordenadas = ['latlng=',this.cronapi.object.getProperty(item, 'cords.latitude'),',',this.cronapi.object.getProperty(item, 'cords.longitude')].join('');
  }.bind(this), function(sender_coordenadas) {
      coordenadas = sender_coordenadas;
    this.cronapi.util.callServerBlocklyNoReturn('blockly.Localizacao:obter_endere_C3_A7o');
  }.bind(this));
}
