<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>인덱스를 만들어 보자</title>

<link
	href="${pageContext.request.contextPath }/resources/css/bootstrap.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!--개인 디자인 추가-->
<link href="${pageContext.request.contextPath }/resources/css/style.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath }/resources/js/bootstrap.js"></script>


</head>
<body>
	<%@ include file="../include/header.jsp"%>
	<!--게시판-->
	<section>
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-md-9 write-wrap">
					<div class="titlebox">
						<p>수정하기</p>
					</div>

					<form action="" name="freeModify2">
						<div>
							<label>DATE</label>
							<p>2019-12-12</p>
						</div>
						<div class="form-group">
							<label>번호</label> <input class="form-control" name="bno"
								value="${vo.bno}" readonly>
						</div>
						<div class="form-group">
							<label>작성자</label> <input class="form-control" name="writer"
								value="${vo.writer}">
						</div>
						<div class="form-group">
							<label>제목</label> <input class="form-control" name="title"
								value="${vo.title}">
						</div>

						<div class="form-group">
							<label>내용</label>
							<textarea class="form-control" rows="10" name="content">${vo.content}</textarea>
						</div>

						<button type="button" class="btn btn-dark" id="listBtn">목록</button>
						<button type="button" class="btn btn-primary" id="updateBtn">변경</button>
						<button type="button" class="btn btn-info" id="deleteBtn">삭제</button>
					</form>

				</div>
			</div>
		</div>
	</section>

	<%@ include file="../include/footer.jsp"%>


	<script>
        
        var listBtn = document.getElementById("listBtn");
        listBtn.onclick = function() {
        	location.href="freeList";
        }
        
		var updateBtn = document.getElementById("updateBtn");
		updateBtn.onclick = function() {

			/*
				1. 폼의 데이터가 공백인지 확인 처리
				2. 공백이 없으면 Controller에 freeUpdate요청으로 데이터를 전송.
				3. 컨트롤러에서는 int update() 메서드를 사용해서 정보를 수정
				4. 컨트롤러에서는 업데이트 성공시 "게시글수정이 정상 처리 되었습니다" 를 출력
			 */

			if (document.freeModify2.writer.value == '') {
				alert('작성자는 필수 입력 사항입니다');
				return;
			} else if (document.freeModify2.title.value == '') {
				alert('제목은 필수 입력 사항입니다');
				return;
			} else if (document.freeModify2.content.value == '') {
				alert('내용은 필수 입력 사항입니다');
				return;
			} else {
				document.freeModify2.action = "freeModify2";
				document.freeModify2.submit();
				console.log("freeModify bno : " + bno);
			}

		}
		
		
		var deleteBtn = document.getElementById("deleteBtn");
		deleteBtn.onclick = function(){
			console.log("asd");
			document.freeModify2.action = "freeDelete";
			document.freeModify2.submit();
		}
	</script>
</body>
</html>