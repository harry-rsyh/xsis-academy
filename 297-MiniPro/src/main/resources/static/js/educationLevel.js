/* REST API */
//[1] Get All EducationList
function getEducationLevel() {
	return $.ajax({
		url: "api/educationLevel/getAllNotDeleted",
		method: "GET",
		async: false
	});
}

//[] Get Level By Id
function getById(id){
	return $.ajax({
		url: `api/educationLevel/getById/${id}`,
		method: "GET",
		async: false
	});
}

//[] Post new List
function postNewLevel(data) {
	$.ajax({
		url: "api/educationLevel/addLevel",
		method: "POST",
		contentType: "application/json",
		data: data,
		success: (response) => {
			if (response == "ok") {
				$("#myModal").modal("hide");
				$("#educationLevelForm").val("");
				$(".modal-body").empty();
				displayEducationList();
			} else {
				alert(response);
			}
		}
	});
}

//[] Update Level
function updateLevel(data){
	$.ajax({
		url: "api/educationLevel/editLevel",
		method: "PUT",
		contentType: "application/json",
		data: data,
		success: (response) => {
			if (response == "ok") {
				$("#myModal").modal("hide");
				$("#educationLevelForm").val("");
				$(".modal-body").empty();
				displayEducationList();
			} else {
				alert(response);
			}
		}
	})
}

//[4] Delete Level
function deleteLevel(id){
	$.ajax({
		url: `api/educationLevel/deleteLevel/${id}`,
		method: "DELETE",
		success: (response) => {
			if (response == "ok") {
				$("#myModal").modal("hide");
				$("#educationLevelForm").val("");
				$(".modal-body").empty();
				displayEducationList();
			} else {
				alert(response);
			}
		}
	})
}

/* Display List */
function displayEducationList() {
	$("#tbodyEdl").empty();
	const list = getEducationLevel().responseJSON;
	list.forEach((data, idx) => {
		$("#tbodyEdl").append(`
			<tr>
				<td class="col">${idx + 1}</td>
					<td class="col-6">${data.name}</td>
					<td class="col-5">
					<div class="d-flex gap-1 justify-content-center">
						<button id="editLevel" class="btn-action px-3" value="${data.id}">U</button>
						<button id="deleteLevel" class="btn-action px-3" value="${data.id}">H</button>
					</div>
				</td>
			</tr>
		`);
	})
}

/* Display Modal */
function displayModal(typeModal){
	//[1] Display Modal box
	$("#myModal").modal("show");
	//[2] .modal-backdrop dipindah kedalam div => .inside-modal
	$('.modal-backdrop').appendTo('.inside-modal');
	//[3] Kosongkan Modal
	$(".modal-body").empty();
	$('#saveLevel').attr('save-type', typeModal || "post");
	$('#saveLevel').html("Simpan");
	
	switch(typeModal){
		case "put": {
			$(".modal-title").html("Ubah");
			$(".modal-body").append(`
				<input id="idLevel" type="hidden"/>
				<input id="inpName" class="form-control" placeholder="ubah nama" type="text" autocomplete="off" />
			`);
			break;
		}
		case "delete": {
			$(".modal-title").html("Hapus!");
			$(".modal-body").append(`
				<input id="idLevel" type="hidden"/>
				<p id='deleteInfo'></p>
			`);
			$('#saveLevel').removeClass("btn-primary");
			$('#saveLevel').addClass("btn-danger");
			$('#saveLevel').html("Hapus!");
			break;
		}
		default: {
			$(".modal-title").html("Tambah");
			$(".modal-body").append(`
				<input id="inpName" class="form-control" placeholder="tambah nama" type="text" autocomplete="off" />
			`);
			break;
		}
	}
}

$(document).ready(function(){
	displayEducationList();
})

/* Show Modal ADD */
$('#addLevel').click(() => {
	// Show Model
	displayModal();

})

/* show Edit Level */
// jquery.on handle re render element if not using jquery.notConflict(..)
$("body").on("click","#editLevel", function(){
	//Show model
	displayModal("edit");
	
	//Insert data to model form
	const data = getById($(this).val()).responseJSON;
	$("#idLevel").val(data.id);
	$("#inpName").val(data.name);
});

/* show Edit Level */
// jquery.on handle re render element if not using jquery.notConflict(..)
$("body").on("click","#deleteLevel", function(){
	//Show model
	displayModal("delete");
	
	//Insert data to model form
	const data = getById($(this).val()).responseJSON;
	$("#idLevel").val(data.id);
	$("#deleteInfo").html(`Anda akan menghapus jenjang pendidikan ${data.name} ?`);
});

$('#saveLevel').click(() => {
	// Membuat Object yang akan dikirimkan ke API
	const obj = {}
	
	// Mengisi object obj.id jika save-type bukan post
	if($('#saveLevel').attr('save-type') != "post"){
		obj.id = $("#idLevel").val();
	}
	// Mengisi Objecet obj.name
	obj.name = $("#inpName").val() || "";
	
	
	// Mengubah ke bentuk JSON String
	const data = JSON.stringify(obj);
	switch($('#saveLevel').attr('save-type')){
		case "post": {
			postNewLevel(data);
			break;
		}
		case "put": {
			updateLevel(data);
			break;
		}
		case "delete": {
			deleteLevel($("#idLevel").val());
			break;
		}
		default: {
			alert("Instruksi tidak dikenal")
			break;
		}
	}
	
})