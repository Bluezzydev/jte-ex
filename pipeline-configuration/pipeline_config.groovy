libraries {
	maven
    sonarqube
}
stages {
	cI{
		build
		static_code_analysis
}
}
