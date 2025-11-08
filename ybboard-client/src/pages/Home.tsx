import CreateProject from "./CreateProject";
import GetProjects from "./Projects";
export default function Home() {
    
    return (
    <div className="Home_Page">
        <h1>Welcome to YBBoard</h1>
        <p>Your project management tool</p>
        {CreateProject()}
        {GetProjects()}
    </div>
  );
}
