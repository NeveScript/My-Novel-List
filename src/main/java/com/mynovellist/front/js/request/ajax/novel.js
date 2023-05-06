function putAllNovelsInATable(tableId) {

    var xmlHttp = (Window.xmlHttpReques) ? new xmlHttpRequest : new ActiveXObject("Microsoft.XMLHTTP");

    xmlHttp.onreadystatechange = function () {

        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {

            var novels = JSON.parse(xmlHttp.responseText);
            var table = document.getElementById(tableId);

            for (var i = 0; i < novels.length; i++) {

                var row = table.insertRow(i + 1);
                var idCell = row.insertCell(0);
                var titleCell = row.insertCell(1);
                idCell.innerHTML = novels[i].id;
                titleCell.innerHTML = novels[i].title;
            }

        }
    }

    xmlHttp.open('GET', 'http://localhost:8080/api/novels');
    xmlHttp.send();
}



function getNovelCount(elementId) {

    var xmlHttp = (Window.xmlHttpReques) ? new xmlHttpRequest : new ActiveXObject("Microsoft.XMLHTTP");

    xmlHttp.onreadystatechange = function () {

        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {

            var novelCount = xmlHttp.responseText;
            document.getElementById(elementId).innerHTML = novelCount;
        }
    }

    xmlHttp.open('GET', 'http://localhost:8080/api/novels/count');
    xmlHttp.send();

}