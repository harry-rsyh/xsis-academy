// Get All EducationList
function getEducationLevel() {
	return $.ajax({
		url: "api/educationLevel/getAllNotDeleted",
		method: "GET",
		async: false
	});
}

// Post new List
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
				showEducationList();
			} else {
				alert(response);
			}
		}
	});
}

function showEducationList() {
	const list = getEducationLevel().responseJSON;
	$("#tbodyEdl").empty();
	list.forEach((data, idx) => {
		$("#tbodyEdl").append(`
			<tr>
				<td class="col">${idx + 1}</td>
					<td class="col-6">${data.name}</td>
					<td class="col-5">
					<div class="d-flex gap-1 justify-content-center">
						<button class="btn-action px-3">U</button>
						<button class="btn-action px-3">H</button>
					</div>
				</td>
			</tr>
		`);
	})
}

showEducationList();

$('#addLevel').click(() => {
	//[1] Display Modal box
	$("#myModal").modal("show");
	$('.modal-backdrop').appendTo('.inside-modal'); // agar backdroup dalam card

	$("#inpName").val(""); // Hapus Inputan yang di batalkan

})

$('#saveLevel').click(() => {
	const data = JSON.stringify({
		name: $("#inpName").val()
	});

	postNewLevel(data);
})