server:
	@ruby -run -e httpd . -p 3000

css:
	@tailwindcss -o static/tailwind.css --watch
