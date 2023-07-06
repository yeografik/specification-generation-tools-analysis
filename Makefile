clean_builds:
	find subjects/ -type d -name build -prune -exec rm -rf {} \;

clean_tests:
	find subjects/ -type d -name test -prune -exec rm -rf {} \;
