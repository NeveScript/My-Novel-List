function getTemplate(templateId, elementToReceiveTheTemplate) {

    var myModel = document.querySelector(templateId);
    var clone = myModel.content.cloneNode(true);
    document.querySelector(elementToReceiveTheTemplate).appendChild(clone);


}